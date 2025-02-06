package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnConnection

@Generated
public fun buildOAuth2ClientApplicationProperty(initializer: @AwsCdkDsl
    CfnConnection.OAuth2ClientApplicationProperty.Builder.() -> Unit = {}):
    CfnConnection.OAuth2ClientApplicationProperty =
    CfnConnection.OAuth2ClientApplicationProperty.Builder().apply(initializer).build()
