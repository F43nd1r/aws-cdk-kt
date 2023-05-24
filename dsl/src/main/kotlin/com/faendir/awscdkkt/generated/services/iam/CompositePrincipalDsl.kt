package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Array
import software.amazon.awscdk.services.iam.CompositePrincipal
import software.amazon.awscdk.services.iam.IPrincipal

@Generated
public fun compositePrincipal(principals: Array<IPrincipal>): CompositePrincipal =
    CompositePrincipal(principals)
