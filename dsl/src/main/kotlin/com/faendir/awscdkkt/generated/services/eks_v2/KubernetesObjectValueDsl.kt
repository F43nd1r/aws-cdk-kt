package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.KubernetesObjectValue
import software.amazon.awscdk.services.eks_v2.KubernetesObjectValueProps
import software.constructs.Construct

@Generated
public fun Construct.kubernetesObjectValue(
  id: String,
  props: KubernetesObjectValueProps,
  initializer: @AwsCdkDsl KubernetesObjectValue.() -> Unit = {},
): KubernetesObjectValue = KubernetesObjectValue(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKubernetesObjectValue(id: String, initializer: @AwsCdkDsl KubernetesObjectValue.Builder.() -> Unit = {}): KubernetesObjectValue = KubernetesObjectValue.Builder.create(this, id).apply(initializer).build()
