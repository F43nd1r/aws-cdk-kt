@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProviderAttributes

public fun kubectlProviderAttributes(initializer: KubectlProviderAttributes.Builder.() -> Unit):
    KubectlProviderAttributes = KubectlProviderAttributes.builder().apply(initializer).build()
