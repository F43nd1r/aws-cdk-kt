package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.AddHeader
import software.amazon.awscdk.services.ses.actions.AddHeaderProps

@Generated
public fun addHeader(props: AddHeaderProps): AddHeader = AddHeader(props)

@Generated
public fun buildAddHeader(initializer: @AwsCdkDsl AddHeader.Builder.() -> Unit): AddHeader =
    AddHeader.Builder.create().apply(initializer).build()
