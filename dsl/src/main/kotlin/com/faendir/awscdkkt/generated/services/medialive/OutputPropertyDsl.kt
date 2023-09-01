package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun buildOutputProperty(initializer: @AwsCdkDsl CfnChannel.OutputProperty.Builder.() -> Unit
    = {}): CfnChannel.OutputProperty =
    CfnChannel.OutputProperty.Builder().apply(initializer).build()
