@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesManifest
import software.amazon.awscdk.services.eks.KubernetesManifestProps
import software.constructs.Construct

public fun Construct.kubernetesManifest(
  id: String,
  props: KubernetesManifestProps,
  initializer: KubernetesManifest.() -> Unit = {},
): KubernetesManifest = KubernetesManifest(this, id, props).apply(initializer)
