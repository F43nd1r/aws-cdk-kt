@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucket

public
    fun abortIncompleteMultipartUploadProperty(initializer: CfnBucket.AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
    CfnBucket.AbortIncompleteMultipartUploadProperty =
    CfnBucket.AbortIncompleteMultipartUploadProperty.builder().apply(initializer).build()
