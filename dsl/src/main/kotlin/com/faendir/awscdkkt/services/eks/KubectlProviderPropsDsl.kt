package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProviderProps

@Generated
public fun kubectlProviderProps(initializer: KubectlProviderProps.Builder.() -> Unit = {}):
    KubectlProviderProps = KubectlProviderProps.builder().apply(initializer).build()
