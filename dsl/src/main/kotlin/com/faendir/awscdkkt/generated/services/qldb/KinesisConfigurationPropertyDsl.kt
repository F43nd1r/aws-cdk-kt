package com.faendir.awscdkkt.generated.services.qldb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStream

@Generated
public fun buildKinesisConfigurationProperty(initializer: @AwsCdkDsl
    CfnStream.KinesisConfigurationProperty.Builder.() -> Unit = {}):
    CfnStream.KinesisConfigurationProperty =
    CfnStream.KinesisConfigurationProperty.Builder().apply(initializer).build()
