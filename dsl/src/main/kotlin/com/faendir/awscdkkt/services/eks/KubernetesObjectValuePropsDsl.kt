package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesObjectValueProps

@Generated
public fun kubernetesObjectValueProps(initializer: KubernetesObjectValueProps.Builder.() -> Unit =
    {}): KubernetesObjectValueProps =
    KubernetesObjectValueProps.builder().apply(initializer).build()
