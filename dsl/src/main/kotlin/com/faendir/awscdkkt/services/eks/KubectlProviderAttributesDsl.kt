@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProviderAttributes

public fun kubectlProviderAttributes(initializer: KubectlProviderAttributes.Builder.() -> Unit):
    KubectlProviderAttributes = KubectlProviderAttributes.builder().apply(initializer).build()
