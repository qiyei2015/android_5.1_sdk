// Generated Code - DO NOT EDIT !!
// generated by 'emugen'


#include <string.h>
#include "renderControl_opcodes.h"

#include "renderControl_enc.h"


#include <stdio.h>

namespace {

void enc_unsupported()
{
	ALOGE("Function is unsupported\n");
}

GLint rcGetRendererVersion_enc(void *self )
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcGetRendererVersion;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;


	GLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcGetEGLVersion_enc(void *self , EGLint* major, EGLint* minor)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_major =  sizeof(EGLint);
	const unsigned int __size_minor =  sizeof(EGLint);
	 unsigned char *ptr;
	 const size_t packetSize = 8 + __size_major + __size_minor + 2*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcGetEGLVersion;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

	*(unsigned int *)(ptr) = __size_major; ptr += 4;
	*(unsigned int *)(ptr) = __size_minor; ptr += 4;
	stream->readback(major, __size_major);
	stream->readback(minor, __size_minor);

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcQueryEGLString_enc(void *self , EGLenum name, void* buffer, EGLint bufferSize)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_buffer =  bufferSize;
	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + __size_buffer + 4 + 1*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcQueryEGLString;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &name, 4); ptr += 4;
	*(unsigned int *)(ptr) = __size_buffer; ptr += 4;
		memcpy(ptr, &bufferSize, 4); ptr += 4;
	stream->readback(buffer, __size_buffer);

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcGetGLString_enc(void *self , EGLenum name, void* buffer, EGLint bufferSize)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_buffer =  bufferSize;
	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + __size_buffer + 4 + 1*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcGetGLString;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &name, 4); ptr += 4;
	*(unsigned int *)(ptr) = __size_buffer; ptr += 4;
		memcpy(ptr, &bufferSize, 4); ptr += 4;
	stream->readback(buffer, __size_buffer);

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcGetNumConfigs_enc(void *self , uint32_t* numAttribs)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_numAttribs =  sizeof(uint32_t);
	 unsigned char *ptr;
	 const size_t packetSize = 8 + __size_numAttribs + 1*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcGetNumConfigs;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

	*(unsigned int *)(ptr) = __size_numAttribs; ptr += 4;
	stream->readback(numAttribs, __size_numAttribs);

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcGetConfigs_enc(void *self , uint32_t bufSize, GLuint* buffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_buffer =  bufSize;
	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + __size_buffer + 1*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcGetConfigs;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &bufSize, 4); ptr += 4;
	*(unsigned int *)(ptr) = __size_buffer; ptr += 4;
	stream->readback(buffer, __size_buffer);

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcChooseConfig_enc(void *self , EGLint* attribs, uint32_t attribs_size, uint32_t* configs, uint32_t configs_size)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_attribs =  attribs_size;
	const unsigned int __size_configs = ((configs != NULL) ?  configs_size*sizeof(uint32_t) : 0);
	 unsigned char *ptr;
	 const size_t packetSize = 8 + __size_attribs + 4 + __size_configs + 4 + 2*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcChooseConfig;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

	*(unsigned int *)(ptr) = __size_attribs; ptr += 4;
	memcpy(ptr, attribs, __size_attribs);ptr += __size_attribs;
		memcpy(ptr, &attribs_size, 4); ptr += 4;
	*(unsigned int *)(ptr) = __size_configs; ptr += 4;
		memcpy(ptr, &configs_size, 4); ptr += 4;
	if (configs != NULL) stream->readback(configs, __size_configs);

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcGetFBParam_enc(void *self , EGLint param)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcGetFBParam;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &param, 4); ptr += 4;

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

uint32_t rcCreateContext_enc(void *self , uint32_t config, uint32_t share, uint32_t glVersion)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcCreateContext;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &config, 4); ptr += 4;
		memcpy(ptr, &share, 4); ptr += 4;
		memcpy(ptr, &glVersion, 4); ptr += 4;

	uint32_t retval;
	stream->readback(&retval, 4);
	return retval;
}

void rcDestroyContext_enc(void *self , uint32_t context)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcDestroyContext;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &context, 4); ptr += 4;
}

uint32_t rcCreateWindowSurface_enc(void *self , uint32_t config, uint32_t width, uint32_t height)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcCreateWindowSurface;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &config, 4); ptr += 4;
		memcpy(ptr, &width, 4); ptr += 4;
		memcpy(ptr, &height, 4); ptr += 4;

	uint32_t retval;
	stream->readback(&retval, 4);
	return retval;
}

void rcDestroyWindowSurface_enc(void *self , uint32_t windowSurface)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcDestroyWindowSurface;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &windowSurface, 4); ptr += 4;
}

uint32_t rcCreateColorBuffer_enc(void *self , uint32_t width, uint32_t height, GLenum internalFormat)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcCreateColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &width, 4); ptr += 4;
		memcpy(ptr, &height, 4); ptr += 4;
		memcpy(ptr, &internalFormat, 4); ptr += 4;

	uint32_t retval;
	stream->readback(&retval, 4);
	return retval;
}

void rcOpenColorBuffer_enc(void *self , uint32_t colorbuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcOpenColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorbuffer, 4); ptr += 4;
}

void rcCloseColorBuffer_enc(void *self , uint32_t colorbuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcCloseColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorbuffer, 4); ptr += 4;
	stream->flush();
}

void rcSetWindowColorBuffer_enc(void *self , uint32_t windowSurface, uint32_t colorBuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcSetWindowColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &windowSurface, 4); ptr += 4;
		memcpy(ptr, &colorBuffer, 4); ptr += 4;
}

int rcFlushWindowColorBuffer_enc(void *self , uint32_t windowSurface)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcFlushWindowColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &windowSurface, 4); ptr += 4;

	int retval;
	stream->readback(&retval, 4);
	return retval;
}

EGLint rcMakeCurrent_enc(void *self , uint32_t context, uint32_t drawSurf, uint32_t readSurf)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcMakeCurrent;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &context, 4); ptr += 4;
		memcpy(ptr, &drawSurf, 4); ptr += 4;
		memcpy(ptr, &readSurf, 4); ptr += 4;

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

void rcFBPost_enc(void *self , uint32_t colorBuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcFBPost;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorBuffer, 4); ptr += 4;
}

void rcFBSetSwapInterval_enc(void *self , EGLint interval)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcFBSetSwapInterval;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &interval, 4); ptr += 4;
}

void rcBindTexture_enc(void *self , uint32_t colorBuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcBindTexture;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorBuffer, 4); ptr += 4;
}

void rcBindRenderbuffer_enc(void *self , uint32_t colorBuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcBindRenderbuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorBuffer, 4); ptr += 4;
}

EGLint rcColorBufferCacheFlush_enc(void *self , uint32_t colorbuffer, EGLint postCount, int forRead)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcColorBufferCacheFlush;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorbuffer, 4); ptr += 4;
		memcpy(ptr, &postCount, 4); ptr += 4;
		memcpy(ptr, &forRead, 4); ptr += 4;

	EGLint retval;
	stream->readback(&retval, 4);
	return retval;
}

void rcReadColorBuffer_enc(void *self , uint32_t colorbuffer, GLint x, GLint y, GLint width, GLint height, GLenum format, GLenum type, void* pixels)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_pixels =  (((glUtilsPixelBitSize(format, type) * width) >> 3) * height);
	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + __size_pixels + 1*4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcReadColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorbuffer, 4); ptr += 4;
		memcpy(ptr, &x, 4); ptr += 4;
		memcpy(ptr, &y, 4); ptr += 4;
		memcpy(ptr, &width, 4); ptr += 4;
		memcpy(ptr, &height, 4); ptr += 4;
		memcpy(ptr, &format, 4); ptr += 4;
		memcpy(ptr, &type, 4); ptr += 4;
	*(unsigned int *)(ptr) = __size_pixels; ptr += 4;
	stream->readback(pixels, __size_pixels);
}

int rcUpdateColorBuffer_enc(void *self , uint32_t colorbuffer, GLint x, GLint y, GLint width, GLint height, GLenum format, GLenum type, void* pixels)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	const unsigned int __size_pixels =  (((glUtilsPixelBitSize(format, type) * width) >> 3) * height);
	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + __size_pixels + 1*4;
	ptr = stream->alloc(8 + 4 + 4 + 4 + 4 + 4 + 4 + 4);
	int tmp = OP_rcUpdateColorBuffer;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorbuffer, 4); ptr += 4;
		memcpy(ptr, &x, 4); ptr += 4;
		memcpy(ptr, &y, 4); ptr += 4;
		memcpy(ptr, &width, 4); ptr += 4;
		memcpy(ptr, &height, 4); ptr += 4;
		memcpy(ptr, &format, 4); ptr += 4;
		memcpy(ptr, &type, 4); ptr += 4;
	stream->flush();
	stream->writeFully(&__size_pixels,4);
	stream->writeFully(pixels, __size_pixels);

	int retval;
	stream->readback(&retval, 4);
	return retval;
}

int rcOpenColorBuffer2_enc(void *self , uint32_t colorbuffer)
{

	renderControl_encoder_context_t *ctx = (renderControl_encoder_context_t *)self;
	IOStream *stream = ctx->m_stream;

	 unsigned char *ptr;
	 const size_t packetSize = 8 + 4;
	ptr = stream->alloc(packetSize);
	int tmp = OP_rcOpenColorBuffer2;memcpy(ptr, &tmp, 4); ptr += 4;
	memcpy(ptr, &packetSize, 4);  ptr += 4;

		memcpy(ptr, &colorbuffer, 4); ptr += 4;

	int retval;
	stream->readback(&retval, 4);
	return retval;
}

}  // namespace

renderControl_encoder_context_t::renderControl_encoder_context_t(IOStream *stream)
{
	m_stream = stream;

	this->rcGetRendererVersion = &rcGetRendererVersion_enc;
	this->rcGetEGLVersion = &rcGetEGLVersion_enc;
	this->rcQueryEGLString = &rcQueryEGLString_enc;
	this->rcGetGLString = &rcGetGLString_enc;
	this->rcGetNumConfigs = &rcGetNumConfigs_enc;
	this->rcGetConfigs = &rcGetConfigs_enc;
	this->rcChooseConfig = &rcChooseConfig_enc;
	this->rcGetFBParam = &rcGetFBParam_enc;
	this->rcCreateContext = &rcCreateContext_enc;
	this->rcDestroyContext = &rcDestroyContext_enc;
	this->rcCreateWindowSurface = &rcCreateWindowSurface_enc;
	this->rcDestroyWindowSurface = &rcDestroyWindowSurface_enc;
	this->rcCreateColorBuffer = &rcCreateColorBuffer_enc;
	this->rcOpenColorBuffer = &rcOpenColorBuffer_enc;
	this->rcCloseColorBuffer = &rcCloseColorBuffer_enc;
	this->rcSetWindowColorBuffer = &rcSetWindowColorBuffer_enc;
	this->rcFlushWindowColorBuffer = &rcFlushWindowColorBuffer_enc;
	this->rcMakeCurrent = &rcMakeCurrent_enc;
	this->rcFBPost = &rcFBPost_enc;
	this->rcFBSetSwapInterval = &rcFBSetSwapInterval_enc;
	this->rcBindTexture = &rcBindTexture_enc;
	this->rcBindRenderbuffer = &rcBindRenderbuffer_enc;
	this->rcColorBufferCacheFlush = &rcColorBufferCacheFlush_enc;
	this->rcReadColorBuffer = &rcReadColorBuffer_enc;
	this->rcUpdateColorBuffer = &rcUpdateColorBuffer_enc;
	this->rcOpenColorBuffer2 = &rcOpenColorBuffer2_enc;
}

