package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.KubernetesManifest
import software.amazon.awscdk.services.eks_v2.KubernetesManifestProps
import software.constructs.Construct

@Generated
public fun Construct.kubernetesManifest(
  id: String,
  props: KubernetesManifestProps,
  initializer: @AwsCdkDsl KubernetesManifest.() -> Unit = {},
): KubernetesManifest = KubernetesManifest(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKubernetesManifest(id: String, initializer: @AwsCdkDsl KubernetesManifest.Builder.() -> Unit = {}): KubernetesManifest = KubernetesManifest.Builder.create(this, id).apply(initializer).build()
