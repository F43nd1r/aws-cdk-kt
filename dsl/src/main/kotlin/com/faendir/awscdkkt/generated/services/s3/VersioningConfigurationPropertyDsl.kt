package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildVersioningConfigurationProperty(initializer: @AwsCdkDsl
    CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit):
    CfnBucket.VersioningConfigurationProperty =
    CfnBucket.VersioningConfigurationProperty.Builder().apply(initializer).build()
