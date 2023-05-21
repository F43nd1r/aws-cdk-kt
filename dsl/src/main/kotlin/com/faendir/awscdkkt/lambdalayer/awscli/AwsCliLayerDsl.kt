package com.faendir.awscdkkt.lambdalayer.awscli

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer
import software.constructs.Construct

@Generated
public fun Construct.awsCliLayer(id: String, initializer: AwsCliLayer.() -> Unit = {}): AwsCliLayer
    = AwsCliLayer(this, id).apply(initializer)
