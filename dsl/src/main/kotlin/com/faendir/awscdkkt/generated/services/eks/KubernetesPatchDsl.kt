package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.constructs.Construct

@Generated
public fun Construct.kubernetesPatch(id: String, props: KubernetesPatchProps): KubernetesPatch =
    KubernetesPatch(this, id, props)

@Generated
public fun Construct.kubernetesPatch(
  id: String,
  props: KubernetesPatchProps,
  initializer: @AwsCdkDsl KubernetesPatch.() -> Unit,
): KubernetesPatch = KubernetesPatch(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKubernetesPatch(id: String, initializer: @AwsCdkDsl
    KubernetesPatch.Builder.() -> Unit): KubernetesPatch = KubernetesPatch.Builder.create(this,
    id).apply(initializer).build()
