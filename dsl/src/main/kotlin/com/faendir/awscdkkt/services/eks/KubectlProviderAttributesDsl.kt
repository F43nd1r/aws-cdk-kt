package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProviderAttributes

@Generated
public fun kubectlProviderAttributes(initializer: KubectlProviderAttributes.Builder.() -> Unit =
    {}): KubectlProviderAttributes = KubectlProviderAttributes.builder().apply(initializer).build()
