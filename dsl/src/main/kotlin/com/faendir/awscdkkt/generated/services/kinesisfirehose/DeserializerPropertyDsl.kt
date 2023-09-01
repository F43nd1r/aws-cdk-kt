package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildDeserializerProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.DeserializerProperty.Builder.() -> Unit = {}):
    CfnDeliveryStream.DeserializerProperty =
    CfnDeliveryStream.DeserializerProperty.Builder().apply(initializer).build()
