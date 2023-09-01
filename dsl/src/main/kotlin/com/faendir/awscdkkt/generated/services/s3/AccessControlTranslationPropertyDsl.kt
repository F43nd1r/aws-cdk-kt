package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildAccessControlTranslationProperty(initializer: @AwsCdkDsl
    CfnBucket.AccessControlTranslationProperty.Builder.() -> Unit = {}):
    CfnBucket.AccessControlTranslationProperty =
    CfnBucket.AccessControlTranslationProperty.Builder().apply(initializer).build()
