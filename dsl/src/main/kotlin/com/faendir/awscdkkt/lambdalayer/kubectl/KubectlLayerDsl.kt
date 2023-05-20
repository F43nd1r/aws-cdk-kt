@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.lambdalayer.kubectl

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer
import software.constructs.Construct

public fun Construct.kubectlLayer(id: String, initializer: KubectlLayer.() -> Unit = {}):
    KubectlLayer = KubectlLayer(this, id).apply(initializer)
