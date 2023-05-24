package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildBufferingHintsProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.BufferingHintsProperty.Builder.() -> Unit):
    CfnDeliveryStream.BufferingHintsProperty =
    CfnDeliveryStream.BufferingHintsProperty.Builder().apply(initializer).build()
