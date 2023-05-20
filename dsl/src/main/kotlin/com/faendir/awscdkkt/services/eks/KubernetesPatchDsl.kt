@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.constructs.Construct

public fun Construct.kubernetesPatch(
  id: String,
  props: KubernetesPatchProps,
  initializer: KubernetesPatch.() -> Unit = {},
): KubernetesPatch = KubernetesPatch(this, id, props).apply(initializer)
