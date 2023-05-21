package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun sseKmsEncryptedObjectsProperty(initializer: CfnBucket.SseKmsEncryptedObjectsProperty.Builder.() -> Unit
    = {}): CfnBucket.SseKmsEncryptedObjectsProperty =
    CfnBucket.SseKmsEncryptedObjectsProperty.builder().apply(initializer).build()
