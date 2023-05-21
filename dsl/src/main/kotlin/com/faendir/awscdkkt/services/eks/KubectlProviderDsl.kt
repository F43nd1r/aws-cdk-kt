package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProvider
import software.amazon.awscdk.services.eks.KubectlProviderProps
import software.constructs.Construct

@Generated
public fun Construct.kubectlProvider(
  id: String,
  props: KubectlProviderProps,
  initializer: KubectlProvider.() -> Unit = {},
): KubectlProvider = KubectlProvider(this, id, props).apply(initializer)
