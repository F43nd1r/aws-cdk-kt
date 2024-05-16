package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.events.targets.AppSync

@Generated
public fun buildAppSync(appsyncApi: IGraphqlApi, initializer: @AwsCdkDsl AppSync.Builder.() -> Unit
    = {}): AppSync = AppSync.Builder.create(appsyncApi).apply(initializer).build()
