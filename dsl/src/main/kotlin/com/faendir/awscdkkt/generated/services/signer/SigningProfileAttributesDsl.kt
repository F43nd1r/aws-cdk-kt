package com.faendir.awscdkkt.generated.services.signer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.signer.SigningProfileAttributes

@Generated
public fun buildSigningProfileAttributes(initializer: @AwsCdkDsl
    SigningProfileAttributes.Builder.() -> Unit = {}): SigningProfileAttributes =
    SigningProfileAttributes.Builder().apply(initializer).build()
