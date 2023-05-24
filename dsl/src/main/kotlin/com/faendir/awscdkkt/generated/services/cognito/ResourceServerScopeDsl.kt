package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.ResourceServerScopeProps

@Generated
public fun resourceServerScope(props: ResourceServerScopeProps): ResourceServerScope =
    ResourceServerScope(props)

@Generated
public fun buildResourceServerScope(initializer: @AwsCdkDsl ResourceServerScope.Builder.() -> Unit):
    ResourceServerScope = ResourceServerScope.Builder.create().apply(initializer).build()
