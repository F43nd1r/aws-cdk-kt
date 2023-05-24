package com.faendir.awscdkkt.generated.services.kms

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.kms.ViaServicePrincipal

@Generated
public fun viaServicePrincipal(serviceName: String): ViaServicePrincipal =
    ViaServicePrincipal(serviceName)

@Generated
public fun viaServicePrincipal(serviceName: String, basePrincipal: IPrincipal): ViaServicePrincipal
    = ViaServicePrincipal(serviceName, basePrincipal)
