package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.ServicePrincipal

@Generated
public fun buildServicePrincipal(service: String, initializer: @AwsCdkDsl ServicePrincipal.Builder.() -> Unit = {}): ServicePrincipal = ServicePrincipal.Builder.create(service).apply(initializer).build()
