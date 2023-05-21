package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucket

@Generated
public
    fun abortIncompleteMultipartUploadProperty(initializer: CfnBucket.AbortIncompleteMultipartUploadProperty.Builder.() -> Unit
    = {}): CfnBucket.AbortIncompleteMultipartUploadProperty =
    CfnBucket.AbortIncompleteMultipartUploadProperty.builder().apply(initializer).build()
