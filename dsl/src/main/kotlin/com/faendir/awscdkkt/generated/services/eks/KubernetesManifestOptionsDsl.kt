package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesManifestOptions

@Generated
public fun buildKubernetesManifestOptions(initializer: @AwsCdkDsl
    KubernetesManifestOptions.Builder.() -> Unit = {}): KubernetesManifestOptions =
    KubernetesManifestOptions.Builder().apply(initializer).build()
