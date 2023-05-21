package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.MutualTlsValidation

@Generated
public fun mutualTlsValidation(initializer: MutualTlsValidation.Builder.() -> Unit = {}):
    MutualTlsValidation = MutualTlsValidation.builder().apply(initializer).build()
