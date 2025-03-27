package com.faendir.awscdkkt.generated.services.cognito.identitypool

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider

@Generated
public fun buildIdentityPoolGoogleLoginProvider(initializer: @AwsCdkDsl
    IdentityPoolGoogleLoginProvider.Builder.() -> Unit = {}): IdentityPoolGoogleLoginProvider =
    IdentityPoolGoogleLoginProvider.Builder().apply(initializer).build()
