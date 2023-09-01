package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildSseKmsEncryptedObjectsProperty(initializer: @AwsCdkDsl
    CfnBucket.SseKmsEncryptedObjectsProperty.Builder.() -> Unit = {}):
    CfnBucket.SseKmsEncryptedObjectsProperty =
    CfnBucket.SseKmsEncryptedObjectsProperty.Builder().apply(initializer).build()
