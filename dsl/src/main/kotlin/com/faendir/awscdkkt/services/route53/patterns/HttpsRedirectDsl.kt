package com.faendir.awscdkkt.services.route53.patterns

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
  initializer: HttpsRedirect.() -> Unit = {},
): HttpsRedirect = HttpsRedirect(this, id, props).apply(initializer)
