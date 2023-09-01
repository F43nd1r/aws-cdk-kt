package com.faendir.awscdkkt.generated.services.route53.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.patterns.HttpsRedirect
import software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps
import software.constructs.Construct

@Generated
public fun Construct.httpsRedirect(
  id: String,
  props: HttpsRedirectProps,
  initializer: @AwsCdkDsl HttpsRedirect.() -> Unit = {},
): HttpsRedirect = HttpsRedirect(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpsRedirect(id: String, initializer: @AwsCdkDsl
    HttpsRedirect.Builder.() -> Unit = {}): HttpsRedirect = HttpsRedirect.Builder.create(this,
    id).apply(initializer).build()
