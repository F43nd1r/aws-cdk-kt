package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun buildKinesisEventProperty(initializer: @AwsCdkDsl
    CfnFunction.KinesisEventProperty.Builder.() -> Unit = {}): CfnFunction.KinesisEventProperty =
    CfnFunction.KinesisEventProperty.Builder().apply(initializer).build()
