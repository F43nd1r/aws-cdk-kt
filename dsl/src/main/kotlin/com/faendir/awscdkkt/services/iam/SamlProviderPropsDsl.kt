package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.SamlProviderProps

@Generated
public fun samlProviderProps(initializer: SamlProviderProps.Builder.() -> Unit = {}):
    SamlProviderProps = SamlProviderProps.builder().apply(initializer).build()
