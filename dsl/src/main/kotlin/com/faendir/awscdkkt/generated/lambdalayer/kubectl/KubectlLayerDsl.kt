package com.faendir.awscdkkt.generated.lambdalayer.kubectl

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer
import software.constructs.Construct

@Generated
public fun Construct.kubectlLayer(id: String): KubectlLayer = KubectlLayer(this, id)

@Generated
public fun Construct.kubectlLayer(id: String, initializer: @AwsCdkDsl KubectlLayer.() -> Unit):
    KubectlLayer = KubectlLayer(this, id).apply(initializer)
