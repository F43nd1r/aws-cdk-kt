package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesObjectValue
import software.amazon.awscdk.services.eks.KubernetesObjectValueProps
import software.constructs.Construct

@Generated
public fun Construct.kubernetesObjectValue(
  id: String,
  props: KubernetesObjectValueProps,
  initializer: KubernetesObjectValue.() -> Unit = {},
): KubernetesObjectValue = KubernetesObjectValue(this, id, props).apply(initializer)
