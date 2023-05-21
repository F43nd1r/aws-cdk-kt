package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.constructs.Construct

@Generated
public fun Construct.kubernetesPatch(
  id: String,
  props: KubernetesPatchProps,
  initializer: KubernetesPatch.() -> Unit = {},
): KubernetesPatch = KubernetesPatch(this, id, props).apply(initializer)
