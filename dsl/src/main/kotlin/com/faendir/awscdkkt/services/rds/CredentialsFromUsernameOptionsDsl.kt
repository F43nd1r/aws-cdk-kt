package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions

@Generated
public
    fun credentialsFromUsernameOptions(initializer: CredentialsFromUsernameOptions.Builder.() -> Unit
    = {}): CredentialsFromUsernameOptions =
    CredentialsFromUsernameOptions.builder().apply(initializer).build()
