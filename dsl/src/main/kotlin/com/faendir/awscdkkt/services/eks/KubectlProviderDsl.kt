@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
