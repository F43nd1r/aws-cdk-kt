package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.amazon.awscdk.services.iam.UnknownPrincipalProps

@Generated
public fun unknownPrincipal(props: UnknownPrincipalProps): UnknownPrincipal =
    UnknownPrincipal(props)

@Generated
public fun buildUnknownPrincipal(initializer: @AwsCdkDsl UnknownPrincipal.Builder.() -> Unit):
    UnknownPrincipal = UnknownPrincipal.Builder.create().apply(initializer).build()
