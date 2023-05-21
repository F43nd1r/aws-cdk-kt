package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesManifestProps

@Generated
public fun kubernetesManifestProps(initializer: KubernetesManifestProps.Builder.() -> Unit = {}):
    KubernetesManifestProps = KubernetesManifestProps.builder().apply(initializer).build()
