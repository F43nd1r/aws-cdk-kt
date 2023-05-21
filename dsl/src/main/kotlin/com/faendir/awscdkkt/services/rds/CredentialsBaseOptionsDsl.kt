package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CredentialsBaseOptions

@Generated
public fun credentialsBaseOptions(initializer: CredentialsBaseOptions.Builder.() -> Unit = {}):
    CredentialsBaseOptions = CredentialsBaseOptions.builder().apply(initializer).build()
