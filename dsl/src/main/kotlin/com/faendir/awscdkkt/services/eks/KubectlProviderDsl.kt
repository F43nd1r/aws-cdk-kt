@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProvider
import software.amazon.awscdk.services.eks.KubectlProviderProps
import software.constructs.Construct

public fun Construct.kubectlProvider(
  id: String,
  props: KubectlProviderProps,
  initializer: KubectlProvider.() -> Unit = {},
): KubectlProvider = KubectlProvider(this, id, props).apply(initializer)
