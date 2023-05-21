package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubernetesPatchProps

@Generated
public fun kubernetesPatchProps(initializer: KubernetesPatchProps.Builder.() -> Unit = {}):
    KubernetesPatchProps = KubernetesPatchProps.builder().apply(initializer).build()
