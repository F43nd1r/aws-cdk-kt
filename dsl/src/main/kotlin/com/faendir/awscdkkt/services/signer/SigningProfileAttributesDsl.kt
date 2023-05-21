package com.faendir.awscdkkt.services.signer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.signer.SigningProfileAttributes

@Generated
public fun signingProfileAttributes(initializer: SigningProfileAttributes.Builder.() -> Unit = {}):
    SigningProfileAttributes = SigningProfileAttributes.builder().apply(initializer).build()
