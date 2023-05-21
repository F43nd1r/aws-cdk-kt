package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesManifestOptions

@Generated
public fun kubernetesManifestOptions(initializer: KubernetesManifestOptions.Builder.() -> Unit =
    {}): KubernetesManifestOptions = KubernetesManifestOptions.builder().apply(initializer).build()
