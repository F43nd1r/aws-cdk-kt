@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.lambdalayer.awscli

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer
import software.constructs.Construct

public fun Construct.awsCliLayer(id: String, initializer: AwsCliLayer.() -> Unit = {}): AwsCliLayer
    = AwsCliLayer(this, id).apply(initializer)
