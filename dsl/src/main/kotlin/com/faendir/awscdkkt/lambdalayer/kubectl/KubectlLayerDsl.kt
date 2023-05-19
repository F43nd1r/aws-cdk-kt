@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.lambdalayer.kubectl

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer
import software.constructs.Construct

public fun Construct.kubectlLayer(id: String, initializer: KubectlLayer.() -> Unit = {}):
    KubectlLayer = KubectlLayer(this, id).apply(initializer)
