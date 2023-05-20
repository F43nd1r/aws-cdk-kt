@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
